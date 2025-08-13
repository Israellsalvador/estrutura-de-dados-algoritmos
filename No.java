 class No<T>{
    private T dado;
    private No<T> nextNo;

    public No(T dado){
        this(dado, null);
    }

    public No(T dado, NO<T> no){
        this.dado = dado;
        this.nextNo = no;
    }

     public T getDado(){
        return this.dado;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public No<T> getNo(){
        return this.nextNo;
    }

    public void setNo(No<T> nextNo){
        this.nextNo = nextNo;
    }

}