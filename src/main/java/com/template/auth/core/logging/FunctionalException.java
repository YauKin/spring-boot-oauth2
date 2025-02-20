package com.template.auth.core.logging;


import com.template.auth.core.constant.ErrorType;

public class FunctionalException extends GeneralException {

    // Constructor
    public FunctionalException(ErrorType type, String message) {
        super(type, message);
    }

    public FunctionalException(ErrorType type) {
        super(type, type.getValue());
    }
}
