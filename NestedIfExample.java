class NestedIfExample {
    public static void main(String[] args) {
        int age=20;
        boolean hasLicense=true;
        if(age>=18){
            if(hasLicense){
                System.out.println("You drive a car");
            }
            else{
                System.out.println("You are not eligible to drive");
            }
        }
        else{
            System.out.println("You are too young to drive");
        }

    }
}
