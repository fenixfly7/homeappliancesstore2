public class WashMachine {  private int ipsos;
    private int platos;
    private int depth;
    private String buildername;
    private String name;
    private String tipos;
    private int consumption;
    private boolean exeipausei;
    private int capacity;
    private String[] thermokrasia;
    private int posotitanerou;

    private static int timesCreated;

    /**
     * default constructor
     */
    public WashMachine()
    {
        timesCreated++;
        periodicMantainance();
    }
    /**
     * recommended constructor
     */
    public WashMachine(int ipsos,int platos,int depth,String buildername,String name,String tipos,int consumption,
                          boolean exeipausei, int capacity,int turnsPerSecond,String[] thermokrasia,int posotitanerou,boolean hasLockForChildren)
    {
        timesCreated++;

        setipsos(ipsos);
        setplatos(platos);
        setDepth(depth);
        setbuildername(buildername);
        setName(name);
        settipos(tipos);
        setconsumption(consumption);

        setPause(exeipausei);
        setCapacity(capacity);
        setthermokrasia(thermokrasia);

    }
    /**
     * get how many times it was created
     */
    public static int getTimesCreated()
    {
        return timesCreated;
    }
    /**
     * overloading feature
     */
    private void periodicMantainance()
    {

    }
    private void periodicMantainance(int overloaded)
    {

    }
    /**
     * shows all fields of the washing machine class
     */
    public void showAll()
    {
        System.out.println("--Washing Machine--");

        System.out.printf("ipsos: %d\n",this.ipsos);
        System.out.printf("platos: %d\n",this.platos);
        System.out.printf("Depth: %d\n",this.depth);
        System.out.printf("buildername: %s\n",this.buildername);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("tipos: %s\n",this.tipos);
        System.out.printf("Power Supply: %d\n",this.consumption);

        System.out.printf("Has Pause: %b\n",this.exeipausei);
        System.out.printf("Capacity: %d\n",this.capacity);
        System.out.printf("thermokrasia: %s\n",this.thermokrasia);
        System.out.printf("Watter Supply: %s\n",this.posotitanerou);
        System.out.printf("Times Created: %d\n",timesCreated);


    }

    /**
     * gets and sets ipsos
     */
    public int getipsos()
    {
        return this.ipsos;
    }
    public void setipsos(int ipsos)
    {
        this.ipsos = ipsos;
    }

    /**
     * gets and sets platos
     */
    public int getplatos()
    {
        return this.platos;
    }
    public void setplatos(int platos)
    {
        this.platos = platos;
    }

    /**
     * gets and sets depth
     */
    public int getDepth()
    {
        return this.depth;
    }
    public void setDepth(int depth)
    {
        this.depth = depth;
    }

    /**
     * gets and sets buildername
     */
    public String getbuildername()
    {
        return this.buildername;
    }
    public void setbuildername(String buildername)
    {
        this.buildername=buildername;
    }

    /**
     * gets and sets name
     */
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    /**
     * gets and sets tipos
     */
    public String gettipos()
    {
        return this.tipos;
    }
    public void settipos(String tipos)
    {
        this.tipos=tipos;
    }

    /**
     * gets and sets power supply
     */
    public int getconsumption()
    {
        return this.consumption;
    }
    public void setconsumption(int consumption)
    {
        this.consumption = consumption;
    }



    //exclusive
    /**
     * gets and sets pause
     */
    public boolean exeipausei() {
        return exeipausei;
    }
    public void setPause(boolean exeipausei) {
        this.exeipausei = exeipausei;
    }

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
     * gets and sets the thermokrasia
     */
    public String[] getthermokrasia() {
        return thermokrasia;
    }
    public void setthermokrasia(String[] thermokrasia) {
        this.thermokrasia = thermokrasia;
    }

    /**
     * gets and sets the water supply
     */
    public int getposotitanerou() {
        return posotitanerou;
    }
    public void setposotitanerou(int posotitanerou) {
        this.posotitanerou = posotitanerou;
    }


}
