package com.bussiness.ecommerce


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.bussiness.ecommerce.Core.presentation.components.PrimaryButton
import com.bussiness.ecommerce.Core.presentation.theme.AppTheme
import com.bussiness.ecommerce.Core.presentation.theme.Font
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import com.bussiness.ecommerce.app.navigation.Navigator
import com.bussiness.ecommerce.authentication.presentation.components.AuthenticationTextField
import com.bussiness.ecommerce.authentication.presentation.components.LoginWithButton
import com.bussiness.ecommerce.authentication.presentation.login.presentation.LoginScreen
import com.bussiness.ecommerce.authentication.presentation.login.presentation.LoginState
import com.bussiness.ecommerce.authentication.presentation.signup.presentation.SignupScreen
import com.bussiness.ecommerce.authentication.presentation.signup.presentation.SignupState
import e_commercefreelance.composeapp.generated.resources.Already_have_account
import e_commercefreelance.composeapp.generated.resources.Confirm_password
import e_commercefreelance.composeapp.generated.resources.Dont_have_account
import e_commercefreelance.composeapp.generated.resources.Email
import e_commercefreelance.composeapp.generated.resources.Forget_password
import e_commercefreelance.composeapp.generated.resources.Login
import e_commercefreelance.composeapp.generated.resources.Login_with
import e_commercefreelance.composeapp.generated.resources.Password
import e_commercefreelance.composeapp.generated.resources.Remember_me
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Signup
import e_commercefreelance.composeapp.generated.resources.User_name
import e_commercefreelance.composeapp.generated.resources.eye_icon
import e_commercefreelance.composeapp.generated.resources.facebook_icon
import e_commercefreelance.composeapp.generated.resources.google_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Preview
@Composable
fun ScreenPreview() {
    CompositionLocalProvider(
        LocalLayoutDirection provides LayoutDirection.Rtl
    ) {
        AppTheme {
            SignupScreen(
                state = SignupState(),
                onAction = {},
                navigator = Navigator(NavController(LocalContext.current))
            )
        }
    }
}







