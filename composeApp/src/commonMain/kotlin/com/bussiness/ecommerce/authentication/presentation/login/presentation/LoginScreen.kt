package com.bussiness.ecommerce.authentication.presentation.login.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.components.PrimaryButton
import com.bussiness.ecommerce.Core.presentation.theme.Font
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import com.bussiness.ecommerce.app.navigation.Navigator
import com.bussiness.ecommerce.app.navigation.Route
import com.bussiness.ecommerce.authentication.presentation.components.AuthenticationTextField
import com.bussiness.ecommerce.authentication.presentation.components.LoginWithButton
import e_commercefreelance.composeapp.generated.resources.Dont_have_account
import e_commercefreelance.composeapp.generated.resources.Email
import e_commercefreelance.composeapp.generated.resources.Forget_password
import e_commercefreelance.composeapp.generated.resources.Login
import e_commercefreelance.composeapp.generated.resources.Login_with
import e_commercefreelance.composeapp.generated.resources.Password
import e_commercefreelance.composeapp.generated.resources.Remember_me
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Signup
import e_commercefreelance.composeapp.generated.resources.closed_eye_icon
import e_commercefreelance.composeapp.generated.resources.eye_icon
import e_commercefreelance.composeapp.generated.resources.facebook_icon
import e_commercefreelance.composeapp.generated.resources.google_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun LoginScreen(
    state: LoginState,
    onAction: (LoginAction) -> Unit,
    navigator: Navigator
) {
    LoginScreenContent(
        state = state,
        onAction = onAction,
        navigator = navigator
    )
}

@Composable
private fun LoginScreenContent(
    state: LoginState,
    onAction: (LoginAction) -> Unit,
    navigator: Navigator
) {
    val focusRequestManager = LocalFocusManager.current

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues)
                .padding(horizontal = 20.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    modifier = Modifier.padding(bottom = 20.dp),
                    text = stringResource(Res.string.Login),
                    fontSize = 30.sp,
                    fontFamily = FontFamily(
                        font = Font.Elmessiri,
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    modifier = Modifier.padding(bottom = 4.dp),
                    text = stringResource(Res.string.Email),
                    fontSize = 14.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Normal
                    ),
                    color = MaterialTheme.colorScheme.onBackground,
                )
                AuthenticationTextField(
                    modifier = Modifier.padding(bottom = 15.dp),
                    value = state.email,
                    onValueChange = {
                        onAction(LoginAction.OnEmailChange(it))
                    },
                    placeholder = {
                        Text(
                            text = stringResource(Res.string.Email),
                            fontSize = 16.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Normal
                            ),
                            color = MaterialTheme.colorScheme.tertiary
                        )
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = {
                            focusRequestManager.moveFocus(FocusDirection.Down)
                        }
                    )
                )
                Text(
                    modifier = Modifier.padding(bottom = 4.dp),
                    text = stringResource(Res.string.Password),
                    fontSize = 14.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Normal
                    ),
                    color = MaterialTheme.colorScheme.onBackground,
                )
                AuthenticationTextField(
                    modifier = Modifier.padding(bottom = 15.dp),
                    value = state.password,
                    onValueChange = {
                        onAction(LoginAction.OnPasswordChange(it))
                    },
                    placeholder = {
                        Text(
                            text = stringResource(Res.string.Password),
                            fontSize = 16.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Normal
                            ),
                            color = MaterialTheme.colorScheme.tertiary
                        )
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {

                        }
                    ),
                    visualTransformation =
                    if (state.isPasswordVisible)
                        VisualTransformation.None
                    else PasswordVisualTransformation(),
                    trailingIcon = {
                        IconButton(
                            onClick = {
                                onAction(LoginAction.OnPasswordVisibilityToggle)
                            }
                        ) {
                            if (state.isPasswordVisible) {
                                Icon(
                                    painter = painterResource(Res.drawable.closed_eye_icon),
                                    contentDescription = "hide password",
                                    tint = MaterialTheme.colorScheme.tertiary
                                )
                            } else {
                                Icon(
                                    painter = painterResource(Res.drawable.eye_icon),
                                    contentDescription = "show password",
                                    tint = MaterialTheme.colorScheme.onBackground
                                )
                            }
                        }
                    }
                )
                Row(
                    modifier = Modifier.fillMaxWidth().padding(bottom = 32.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Switch(
                            checked = state.rememberMe,
                            onCheckedChange = {
                                onAction(LoginAction.OnRememberMeCheckToggle)
                            },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = MaterialTheme.colorScheme.background,
                                uncheckedThumbColor = MaterialTheme.colorScheme.primary,
                                checkedTrackColor = MaterialTheme.colorScheme.primary,
                                uncheckedTrackColor = MaterialTheme.colorScheme.secondary,
                                uncheckedBorderColor = MaterialTheme.colorScheme.secondary,
                                checkedBorderColor = MaterialTheme.colorScheme.primary,

                                )
                        )
                        Text(
                            text = stringResource(Res.string.Remember_me),
                            fontSize = 14.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Normal
                            ),
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                    TextButton(
                        onClick = {}
                    ) {
                        Text(
                            text = stringResource(Res.string.Forget_password),
                            fontSize = 14.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Normal
                            ),
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                }
                PrimaryButton(
                    modifier = Modifier
                        .padding(bottom = 32.dp)
                        .fillMaxWidth()
                        .height(56.dp),
                    onClick = {
                        navigator.navigate(Route.Home)
                    },
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = stringResource(Res.string.Login),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Bold
                        )
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    HorizontalDivider(
                        modifier = Modifier
                            .weight(1f)
                            .background(MaterialTheme.colorScheme.outline)
                    )
                    Text(
                        text = stringResource(Res.string.Login_with),
                        fontSize = 14.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Normal
                        ),
                        color = MaterialTheme.colorScheme.onTertiary
                    )
                    HorizontalDivider(
                        modifier = Modifier
                            .weight(1f)
                            .background(MaterialTheme.colorScheme.outline)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 60.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    LoginWithButton {
                        Icon(
                            painter = painterResource(Res.drawable.google_icon),
                            contentDescription = "Sign in with google",
                            tint = Color.Unspecified
                        )
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    LoginWithButton {
                        Icon(
                            painter = painterResource(Res.drawable.facebook_icon),
                            contentDescription = "Sign in with google",
                            tint = Color.Unspecified
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = stringResource(Res.string.Dont_have_account),
                        fontSize = 14.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Normal
                        ),
                        color = MaterialTheme.colorScheme.tertiary
                    )
                    TextButton(
                        onClick = {
                            navigator.navigate(Route.Signup)
                        },
                        contentPadding = PaddingValues(vertical = 0.dp, horizontal = 4.dp)
                    ) {
                        Text(
                            text = stringResource(Res.string.Signup),
                            fontSize = 14.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Bold
                            ),
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                }
            }
        }
    }
}