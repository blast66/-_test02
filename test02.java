public class test02{
    public static void main(String[] args) {
        int[] data = new int[1];
        data[0] = 1;

        human person = new human("man", 180, 50); 

        person.printsum();
        System.out.println();
        System.out.println("sex = "+ person.sex);
        System.out.println("weight = "+ person.weight);
        System.out.println("hight = "+ person.hight);
    }

}

