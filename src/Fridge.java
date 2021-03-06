public class Fridge {
    private int ipsos;
    private int platos;
    private int depth;
    private String buildername;
    private String name;
    private String tipos;
    private int consumption;
    private int capacity;
    private int rafia;
    private String color;
    private boolean exeisyntyrisi;
    private boolean exeikatapxisi;

    private static int timesCreated;

    /**
     * default constructor
     */
    public Fridge()
    {
        periodicMantainance();
        timesCreated++;
    }
    /**
     * recommended constructor
     */
    public Fridge(int ipsos,int platos,int depth,String buildername,String name,String tipos,int consumption,
                  int noiseRate,int capacity,int rafia,String color,boolean exeisyntyrisi,boolean exeikatapxisi)
    {
        timesCreated++;

        setipsos(ipsos);
        setplatos(platos);
        setDepth(depth);
        setbuildername(buildername);
        setName(name);
        settipos(tipos);
        setconsumption(consumption);

        setCapacity(capacity);
        setrafia(rafia);
        setColor(color);
        setNoFrost(exeisyntyrisi);
        setIceExit(exeikatapxisi);

    }
    /**
     * gets how many times the object has been created
     */
    public static int getTimesCreated()
    {
        return timesCreated;
    }
    /**
     * just showcasing the overloading feature
     */
    private void periodicMantainance()
    {

    }
    private void periodicMantainance(int overloaded)
    {

    }
    /**
     * prints every field of the class
     */
    public void showAll()
    {
        System.out.println("--Fridge--");

        System.out.printf("ipsos: %d\n",this.ipsos);
        System.out.printf("platos: %d\n",this.platos);
        System.out.printf("Depth: %d\n",this.depth);
        System.out.printf("buildername: %s\n",this.buildername);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("tipos: %s\n",this.tipos);
        System.out.printf("Power Supply: %d\n",this.consumption);

        System.out.printf("Capacity: %d\n",this.capacity);
        System.out.printf("rafia: %d\n",this.rafia);
        System.out.printf("Color: %s\n",this.color);
        System.out.printf("Has No Frost: %b\n",this.exeisyntyrisi);
        System.out.printf("Has Ice Exit: %b\n",this.exeikatapxisi);
        System.out.printf("Times Created: %d\n",timesCreated);

    }


    /**
     * gets and sets ipsos
     */
    public int getipsos() {
        return this.ipsos;
    }
    public void setipsos(int ipsos) {
        this.ipsos = ipsos;
    }

    /**
     * gets and sets platos
     */
    public int getplatos() {
        return this.platos;
    }
    public void setplatos(int platos) {
        this.platos = platos;
    }

    /**
     * gets and sets depth
     */
    public int getDepth() {
        return this.depth;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * gets and sets buildername
     */
    public String getbuildername() {
        return this.buildername;
    }
    public void setbuildername(String buildername) {
        this.buildername = buildername;
    }

    /**
     * gets and sets name
     */
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets and sets tipos
     */
    public String gettipos() {
        return this.tipos;
    }
    public void settipos(String tipos) {
        this.tipos = tipos;
    }

    /**
     * gets and sets power supply
     */
    public int getconsumption() {
        return this.consumption;
    }
    public void setconsumption(int consumption) {
        this.consumption = consumption;
    }


    //exclusive

    /**
     * gets and sets capacity
     */
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    /**
     * gets and sets rafia
     */
    public int getrafia() {
        return rafia;
    }
    public void setrafia(int rafia) {
        this.rafia = rafia;
    }
    /**
     * gets and sets color
     */
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * gets and sets no frost
     */
    public boolean exeisyntyrisi() {
        return exeisyntyrisi;
    }
    public void setNoFrost(boolean exeisyntyrisi) {
        this.exeisyntyrisi = exeisyntyrisi;
    }
    /**
     * gets and sets ice exit
     */
    public boolean exeikatapxisi() {
        return exeikatapxisi;
    }
    public void setIceExit(boolean exeikatapxisi) {
        this.exeikatapxisi = exeikatapxisi;
    }
}
