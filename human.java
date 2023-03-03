class human{ 
    String sex; 
    int weight;
    int hight;
    
    public  human(String s,int w,int h){ //方法名稱要與類別相同,
        this.sex = s;    
        this.weight = w;
        this.hight = h;
    }

    public void printsum(){ 
                
        System.out.println("My sex is : " + sex +"\n"+ "My weight is : " + weight+"\n" +"My hight is : " + hight);

    }
}