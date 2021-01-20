public class aircondition {

    private int distance, height , depth;
    private String buildername;
    private String devicename;
    private String type;
    private int consumption;
    private String color;
    private int number , sound , attributionco , attributionho;




    public void Setdistance(int distance){this.distance = distance;}
    public void Setheight(int height){this.height = height;}
    public void Setdepth(int depth){this.depth = depth;}
    public void Setbuildername(String buildername){this.buildername = buildername;}
    public void Setdevicename(String devicename){this.devicename = devicename;}
    public void Settype(String type){this.type = type;}
    public void Setconsumption(int consumption){this.consumption = consumption;}
    public void Setcolor(String color){this.color = color;}
    public void Setnumber(int number){this.number = number;}
    public void Setsound(int sound){this.sound = sound ;}
    public void Setattributionco (int attributionco){this. attributionco = attributionco;}
    public void Setattributionho (int attributionho){this.attributionho =attributionho ;}
    /** me to get tha epistrefoume autes tis times */
    public int Getdistance(){return distance;}
    public int Getheight(){return height;}
    public int Getdepth(){return depth;}
    public String Getbuildername(){return buildername;}
    public String Getdevicename(){return devicename;}
    public String Gettype(){return type;}
    public int Getconsumption(){return consumption;}
    public String Getcolor(){return color;}
    public int Getnumber(){return number;}
    public int Getsound(){return sound;}
    public int Getapodoshpsukshs(){return attributionco;}
    public int Getapodoshthermanshs(){return attributionho;}
    static int AirCounter = 0;


    public int AirCounter()
    {
        System.out.printf("AirConditions: ");
        return AirCounter;
    }
    aircondition(int distance,int height,int depth,int consumption,int number,int sound,int attributionco,int attributionho,String color,String type,String buildername,String devicename)
    {
        try
        {
            Setdistance(distance);
            Setheight(height);
            Setdepth(depth);
            Setconsumption(consumption);
            Setnumber(number);
            Setsound(sound);
            Setattributionco(attributionco);
            Setattributionho(attributionho);
            Settype(type);
            Setcolor(color);
            Setbuildername(buildername);
            Setdevicename(devicename);
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        AirCounter = AirCounter + 1;
        Display();
    }
    public void Display()
    {
        System.out.printf("type: %s\n",Gettype());
        System.out.printf("Kataskeuasths: %s\n" , Getbuildername());
        System.out.printf("%s - height:%dcm, distance:%dcm, depth:%dcm\nconsumption(ethsia): %dkW/h number: %d€\n",Getdevicename(),Getheight(),Getdistance(),Getdepth(),Getconsumption(),Getnumber());
        System.out.printf("Apodosh psukshs: %dW/W, Apodosh thermanshs: %dW/W\ncolor: %s sound: %ddb\n\n",Getapodoshpsukshs(),Getapodoshthermanshs(),Getcolor(),Getsound());
    }
    private void periodicMantainance(){}
}


