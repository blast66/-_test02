class human{ 
    String sex; 
    int weight;
    int hight;
    
    public  human(String s,int w,int h){ //方法名稱要與類別相同,
        this.sex = s;    
        this.weight = w;
        this.hight = h;
    }

    public void printsax(){ 
                
        System.out.println("My sex is : " + sex );

    }
    public void printhight(){ 
                
        System.out.println("My hight is : " + hight );

    }
    public void printweight(){ 
                
        System.out.println("My weight is : " + weight );

    }
    
}

