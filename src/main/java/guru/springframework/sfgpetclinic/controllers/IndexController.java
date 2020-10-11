package guru.springframework.sfgpetclinic.controllers;

public class IndexController {

    public String index(){

        return "index";
    }

    public String oupsHandler(){
        return "notimplemented";
    }

    public String oopsHandlerException() throws ValueNotFoundException {
        throw new ValueNotFoundException();
    }

}
