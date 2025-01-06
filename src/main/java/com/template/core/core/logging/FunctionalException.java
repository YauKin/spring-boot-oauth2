package com.template.core.core.logging;


import com.template.core.core.constant.ErrorType;

public class FunctionalException extends GeneralException {

    // Constructor
    public FunctionalException(ErrorType type, String message) {
        super(type, message);
    }

    public FunctionalException(ErrorType type) {
        super(type, type.getValue());
    }
}
