public class Oven {
    private int ipsos;
    private int platos;
    private int depth;
    private String buildername;
    private String name;
    private String tipos;
    private int consumption;
    private int horiticotita;
    private boolean psifiako;
    private boolean keramiko;

    private static int timesCreated;
    /**
     * default constructor
     */
    public Oven()
    {
        timesCreated++;
        periodicMantainance();
    }
    /**
     * recommended constructor
     */
    public Oven(int ipsos,int platos,int depth,String buildername,String name,String tipos,int consumption,
                int horiticotita,boolean psifiako,boolean hasCleaningSystem,boolean keramiko,boolean hasGrill)
    {
        timesCreated++;

        setipsos(ipsos);
        setplatos(platos);
        setDepth(depth);
        setbuildername(buildername);
        setName(name);
        settipos(tipos);
        setconsumption(consumption);

        sethoriticotita(horiticotita);
        setDigital(psifiako);
        setCeramic(keramiko);



    }
    /**
     * gets how many times the object has been created
     */
    public static int getTimesCreated()
    {
        return timesCreated;
    }
    /**
     * showcase for the overloading feature
     */
    private void periodicMantainance()
    {

    }
    private void periodicMantainance(int overloaded)
    {

    }
    /**
     * prints all the features of the oven
     */
    public void showAll()
    {
        System.out.println("--Oven--");

        System.out.printf("ipsos: %d\n",this.ipsos);
        System.out.printf("platos: %d\n",this.platos);
        System.out.printf("Depth: %d\n",this.depth);
        System.out.printf("buildername: %s\n",this.buildername);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("tipos: %s\n",this.tipos);
        System.out.printf("consumption: %d\n",this.consumption);

        System.out.printf("horiticotita: %d\n",this.horiticotita);
        System.out.printf("psifiako: %b\n",this.psifiako);
        System.out.printf("Is Ceramic: %b\n",this.keramiko);
        System.out.printf("Items Created: %d\n",timesCreated);
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
     * gets and sets consumption
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
     * gets and sets horiticotita
     */
    public int gethoriticotita() {
        return horiticotita;
    }
    public void sethoriticotita(int horiticotita) {
        this.horiticotita = horiticotita;
    }
    /**
     * gets and sets if its digital
     */
    public boolean psifiako() {
        return psifiako;
    }
    public void setDigital(boolean digital) {
        psifiako = digital;
    }
    
    /**
     * gets and sets the ceramic
     */
    public boolean keramiko() {
        return keramiko;
    }
    public void setCeramic(boolean ceramic) {
        keramiko = ceramic;
    }

}
