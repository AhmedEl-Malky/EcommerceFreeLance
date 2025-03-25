package com.bussiness.ecommerce.authentication.presentation.signup.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
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
import e_commercefreelance.composeapp.generated.resources.Already_have_account
import e_commercefreelance.composeapp.generated.resources.Confirm_password
import e_commercefreelance.composeapp.generated.resources.Email
import e_commercefreelance.composeapp.generated.resources.Login
import e_commercefreelance.composeapp.generated.resources.Password
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Signup
import e_commercefreelance.composeapp.generated.resources.User_name
import e_commercefreelance.composeapp.generated.resources.closed_eye_icon
import e_commercefreelance.composeapp.generated.resources.eye_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun SignupScreen(
    state: SignupState,
    onAction: (SignupAction) -> Unit,
    navigator: Navigator
) {
    SignupScreenContent(
        state = state,
        onAction = onAction,
        navigator = navigator
    )
}

@Composable
private fun SignupScreenContent(
    state: SignupState,
    onAction: (SignupAction) -> Unit,
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
                    text = stringResource(Res.string.Signup),
                    fontSize = 30.sp,
                    fontFamily = FontFamily(
                        font = Font.Elmessiri,
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    modifier = Modifier.padding(bottom = 4.dp),
                    text = stringResource(Res.string.User_name),
                    fontSize = 14.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Normal
                    ),
                    color = MaterialTheme.colorScheme.onBackground,
                )
                AuthenticationTextField(
                    modifier = Modifier.padding(bottom = 15.dp),
                    value = state.userName,
                    onValueChange = {
                        onAction(SignupAction.OnUserNameChange(it))
                    },
                    placeholder = {
                        Text(
                            text = stringResource(Res.string.User_name),
                            fontSize = 16.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Normal
                            ),
                            color = MaterialTheme.colorScheme.tertiary
                        )
                    },
                    isError = state.userNameError != null,
                    supportingText = {
                        state.userNameError?.let{ error ->
                            Text(
                                text = error.asString(),
                                fontSize = 14.sp,
                                fontFamily = FontFamily(
                                    weight = FontWeight.Normal
                                )
                            )
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.Sentences,
                        keyboardType = KeyboardType.Text,
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
                        onAction(SignupAction.OnEmailChange(it))
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
                    isError = state.emailError != null,
                    supportingText = {
                        state.emailError?.let{ error ->
                            Text(
                                text = error.asString(),
                                fontSize = 14.sp,
                                fontFamily = FontFamily(
                                    weight = FontWeight.Normal
                                )
                            )
                        }
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
                        onAction(SignupAction.OnPasswordChange(it))
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
                    isError = state.passwordError != null,
                    supportingText = {
                        state.passwordError?.let{ error ->
                            Text(
                                text = error.asString(),
                                fontSize = 14.sp,
                                fontFamily = FontFamily(
                                    weight = FontWeight.Normal
                                )
                            )
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = {
                            focusRequestManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    visualTransformation = if (state.isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        IconButton(
                            onClick = {
                                onAction(SignupAction.OnPasswordVisibilityToggle)
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
                Text(
                    modifier = Modifier.padding(bottom = 4.dp),
                    text = stringResource(Res.string.Confirm_password),
                    fontSize = 14.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Normal
                    ),
                    color = MaterialTheme.colorScheme.onBackground,
                )
                AuthenticationTextField(
                    modifier = Modifier.padding(bottom = 24.dp),
                    value = state.confirmPassword,
                    onValueChange = {
                        onAction(SignupAction.OnConfirmPasswordChange(it))
                    },
                    placeholder = {
                        Text(
                            text = stringResource(Res.string.Confirm_password),
                            fontSize = 16.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Normal
                            ),
                            color = MaterialTheme.colorScheme.tertiary
                        )
                    },
                    isError = state.confirmPasswordError != null,
                    supportingText = {
                        state.confirmPasswordError?.let{ error ->
                            Text(
                                text = error.asString(),
                                fontSize = 14.sp,
                                fontFamily = FontFamily(
                                    weight = FontWeight.Normal
                                )
                            )
                        }
                    },
                    visualTransformation = if (state.isConfirmPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {

                        }
                    ),
                    trailingIcon = {
                        IconButton(
                            onClick = {
                                onAction(SignupAction.OnConfirmPasswordVisibilityToggle)
                            }
                        ) {
                            if (state.isConfirmPasswordVisible) {
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
                PrimaryButton(
                    modifier = Modifier
                        .padding(bottom = 26.dp)
                        .fillMaxWidth()
                        .height(56.dp),
                    onClick = {
                        navigator.navigate(Route.Home)
                    },
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = stringResource(Res.string.Signup),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Bold
                        )
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = stringResource(Res.string.Already_have_account),
                        fontSize = 14.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Normal
                        ),
                        color = MaterialTheme.colorScheme.tertiary
                    )
                    TextButton(
                        onClick = {
                            navigator.navigate(Route.Login)
                        },
                        contentPadding = PaddingValues(vertical = 0.dp, horizontal = 4.dp)
                    ) {
                        Text(
                            text = stringResource(Res.string.Login),
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
