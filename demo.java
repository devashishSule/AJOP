class demo{
    void basic(){
        System.out.println("This is a basic method.");
    }

    int basicIntMeth(int x){
        System.out.println("This method will return an integer.");
        return x;
    }

    int intArray(int arr[]){
        System.out.println();
        System.out.println("This method will take an array as parameter.");
        System.out.println("Printing the element at 1th index: " + arr[1]);
        return arr[0];
    }

    String strArray(String arr[]){
        System.out.println();
        System.out.println("This method will take string array as parameter.");
        System.out.println("Printing the word at 1th index: " + arr[1]);
        return arr[0];
    }

    // user-defined data type
    class abc{
        void display(){
            System.out.println();
            System.out.println("Inside user-defined data type..");
        }
    }

    // user-defined method
    abcd userdefinedMeth(){
        abcd obj = new abcd();
        return obj;
    }

    public static void main(String args[]){
        demo ob = new demo();
        ob.basic();

        int intArr[] = {1,2,3,4,5,6,7};
        ob.intArray(intArr);
        int firstElement[] = ob.intArray(intArr);
        System.out.println("Returned value from intArray() can be stored in another variable: " + firstElement[0] );

        // calling String array method 
        String strArr[] = {"Devashish","Harsh","Saish"};
        ob.strArray(strArray);
        String firstString[] = ob.strArray(strArr);
        System.out.println("Returned value from intArray() can be stored in another variable: " + firstString[0] );

        // creating an object and calling user-defined data type 
        abc ob1 = new abc();
        ob1.display();

        // storing user-defined method in defined type of method
        abcd ob2 = new abcd();
        ob2.display(); // calling the method from user-defined data type

    }
}