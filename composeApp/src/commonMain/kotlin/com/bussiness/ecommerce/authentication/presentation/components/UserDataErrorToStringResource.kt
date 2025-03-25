package com.bussiness.ecommerce.authentication.presentation.components

import com.bussiness.ecommerce.Core.domain.UiText
import com.bussiness.ecommerce.authentication.domain.UserDataValidator
import e_commercefreelance.composeapp.generated.resources.Confirmed_password_mismatch
import e_commercefreelance.composeapp.generated.resources.Email_is_empty
import e_commercefreelance.composeapp.generated.resources.Invalid_email
import e_commercefreelance.composeapp.generated.resources.Name_is_empty
import e_commercefreelance.composeapp.generated.resources.Name_is_short
import e_commercefreelance.composeapp.generated.resources.Password_is_empty
import e_commercefreelance.composeapp.generated.resources.Password_is_short
import e_commercefreelance.composeapp.generated.resources.Res


fun UserDataValidator.UserDataError.toUiText(): UiText {
    val stringRes = when (this) {
        UserDataValidator.UserDataError.EMAIL_IS_EMPTY -> Res.string.Email_is_empty
        UserDataValidator.UserDataError.INVALID_EMAIL -> Res.string.Invalid_email
        UserDataValidator.UserDataError.PASSWORD_IS_EMPTY -> Res.string.Password_is_empty
        UserDataValidator.UserDataError.IS_TOO_SHORT -> Res.string.Password_is_short
        UserDataValidator.UserDataError.PASSWORDS_MISMATCH -> Res.string.Confirmed_password_mismatch
        UserDataValidator.UserDataError.NAME_IS_EMPTY -> Res.string.Name_is_empty
        UserDataValidator.UserDataError.NAME_IS_SHORT -> Res.string.Name_is_short
    }
    return UiText.StringResourceId(stringRes)
}
