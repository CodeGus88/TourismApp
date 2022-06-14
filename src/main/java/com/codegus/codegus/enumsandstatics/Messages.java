package com.codegus.codegus.enumsandstatics;

public class Messages {

    public static final String ID_PROPERTY = "${id}";

    public final static String NOT_FOUND = "Element with id \""+ ID_PROPERTY +"\" does not exist";

    public static String getNotFoundMessage(final String ID){
        return NOT_FOUND.replace(ID_PROPERTY, ID);
    }

}
