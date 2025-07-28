package app2.exceptions;

import java.util.List;
import java.util.stream.Collectors;

public class IncorrectPersonStringException extends RuntimeException {
    private List<String> errorList;

    public IncorrectPersonStringException(List<String> messages) {
        errorList = messages;
    }

    @Override
    public String getMessage() {
        if (errorList == null || errorList.isEmpty())
            return "";
        return errorList.stream()
                .collect(Collectors.joining(";\n", "Ошибки: ", ""));

    }


}
