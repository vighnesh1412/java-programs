class this1{
    int instVar;

    this1(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        this1 obj = new this1(8);
        System.out.println("object reference = " + obj);
    }
}