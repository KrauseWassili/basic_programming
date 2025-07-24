package app1.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NotCorrectEmailFormatException2 extends RuntimeException{
    List<String> list;


    public NotCorrectEmailFormatException2(List<String> errors) {
        if (errors==null || errors.isEmpty()){
            throw new RuntimeException("Попытка создания NotCorrectEmailFormatException без ошибок ");
        }
        list = errors;
    }

    @Override
    public String  getMessage(){
        if (list==null || list.isEmpty()) {
            return "";
        }
        return list.stream()
                .collect(Collectors.joining(";","Errors: [","]")); // Errors[ ...... ]
    }

}