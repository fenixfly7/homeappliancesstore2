public class aircondition {
    private int ipsos;
    private int platos;
    private int depth;
    private String buildername;
    private String name;
    private String tipos;
    private int consumption;

    private int zesto;
    private int cryo;
    private boolean exeiwifi;
    private boolean exeifiltro;
    private String coldRank;

    private static int timesCreated;
    /**
     * default constructor that sets everything to default values
     must be public
     */
    public aircondition()
    {
        periodicMantainance();
        timesCreated++;
    }
    
    public aircondition(int ipsos,int platos,int depth,String buildername,String name,String tipos,int consumption,
                        int zesto,int cryo,boolean exeiwifi,boolean exeifiltro,String coldRank,boolean isInverter)
    {
        timesCreated++;

        setipsos(ipsos);
        setplatos(platos);
        setDepth(depth);
        setbuildername(buildername);
        setName(name);
        settipos(tipos);
        setconsumption(consumption);

        setzesto(zesto);
        setcryo(cryo);
        setWifi(exeiwifi);
        setAirFilter(exeifiltro);
        setColdRank(coldRank);
    }
    /**
     * prints in console every field of the class,
     * must be public
     */
    public void showAll()
    {
        System.out.println("--Air Conditioner--");

        System.out.printf("ipsos: %d\n",this.ipsos);
        System.out.printf("platos: %d\n",this.platos);
        System.out.printf("Depth: %d\n",this.depth);
        System.out.printf("buildername: %s\n",this.buildername);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("tipos: %s\n",this.tipos);
        System.out.printf("Power Supply: %d\n",this.consumption);

        System.out.printf("Cold Power: %d\n",this.zesto);
        System.out.printf("Hot Power: %d\n",this.cryo);
        System.out.printf("Has Wifi: %b\n",this.exeiwifi);
        System.out.printf("Has Air Filtering: %b\n",this.exeifiltro);
        System.out.printf("Cold Ranking: %s\n",this.coldRank);
        System.out.printf("Times Created: %d\n",timesCreated);

    }
    /**
     * gets how many times an AirCondition was made
     * must be public
     */

    public static int getTimesCreated()
    {
        return timesCreated;
    }


    private void periodicMantainance()
    {

    }
    /**
     * overloads a method
     */
    private void periodicMantainance(int overloaded)
    {

    }

    /**
     * gets and sets ipsos
     *  must be public, but we can change it later maybe to only initialize in constructor
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
     *  must be public
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
     *  must be public
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
     *  must be public
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
     *  must be public
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
     *  must be public
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
     *  must be public
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
     * gets and sets cold power
     *  must be public
     */
    public int getzesto() {
        return zesto;
    }
    public void setzesto(int zesto) {
        this.zesto = zesto;
    }

    /**
     * gets and sets hot power
     *  must be public
     */
    public int getcryo() {
        return cryo;
    }

    public void setcryo(int cryo) {
        this.cryo = cryo;
    }
    /**
     * gets and sets the wifi
     *  must be public
     */
    public boolean exeiwifi() {
        return exeiwifi;
    }

    public void setWifi(boolean exeiwifi) {
        this.exeiwifi = exeiwifi;
    }
    /**
     * gets and sets air filter
     *  must be public
     */
    public boolean exeifiltro() {
        return exeifiltro;
    }

    public void setAirFilter(boolean exeifiltro) {
        this.exeifiltro = exeifiltro;
    }

    /**
     * gets and sets cold rank
     *  must be public
     */
    public String getColdRank() {
        return coldRank;
    }

    public void setColdRank(String coldRank) {
        this.coldRank = coldRank;
    }
    
}


