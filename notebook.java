public class notebook{

    private String color;
    private Integer RAM;
    private String OS;
    private Integer HDD;
    private Integer id;
    private String brand;
    private String model;
    private boolean isBooked = false;

    public notebook(String model,Integer id, String brand){
        this.model = model;
        this.brand = brand;
        this.id = id;
        System.out.println("Ноутбук марки "+"'"+ this.brand+"'"+" Модель "+this.model+" С id " +Integer.toString(this.id));
    }
    
    public String getColor(){
        return this.color;
    }
    
    public Integer getRAM(){
        return this.RAM;
    }
    
    public String getOS(){
        return this.OS;
    }
    
    public Integer getHDD(){
        return this.HDD;
    }
    
    public Integer getID(){
        return this.id;
    }

    public String getVend(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public Boolean getBooking(){
        return this.isBooked;
    }

    public void setColor(String color){
        this.color =color;
    }

    public void setRAM(Integer RAM){
        this.RAM = RAM;
    }

    public void setOS(String OS){
        this.OS = OS;
    }

    public void setHDD(Integer HDD){
        this.HDD = HDD;
    }
    
    public void Book(){
        if (isBooked==false){
            this.isBooked=true;
        }
        else System.out.println("Этот ноутбук в резерве");
    }
    
    @Override
   
    public String toString(){
        StringBuilder  strbuild = new StringBuilder();
        strbuild.append("Ноутбук ");
        strbuild.append(this.id);
        strbuild.append(System.lineSeparator());
        strbuild.append(this.color);
        strbuild.append(" ");
        strbuild.append(this.brand);
        strbuild.append(" ");
        strbuild.append(this.model);
        strbuild.append(System.lineSeparator());
        strbuild.append("OS "+this.OS);
        strbuild.append(System.lineSeparator());
        strbuild.append("HDD "+this.HDD);
        strbuild.append(System.lineSeparator());
        strbuild.append("RAM "+this.RAM);
        strbuild.append(System.lineSeparator());
        if(this.isBooked==false) strbuild.append("Не зарезервирован");
        else strbuild.append("Зарезервирован");

        
        return(strbuild.toString());
    }
}