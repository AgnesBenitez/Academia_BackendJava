class Account {//definicion de la clase
    Integer id;
    String name;//atributos
    String document;
    String email;
    String password;

    public Account(String name, String document){//metodo constructor
        this.name = name;
        this.document = document;
    }
}