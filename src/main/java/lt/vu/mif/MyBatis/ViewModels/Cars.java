package lt.vu.mif.MyBatis.ViewModels;

public class Cars {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CARS.ID
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CARS.MANUFACTURER
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    private String manufacturer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CARS.MODEL
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    private String model;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CARS.DRIVER_ID
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    private Integer driverId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CARS.ID
     *
     * @return the value of PUBLIC.CARS.ID
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CARS.ID
     *
     * @param id the value for PUBLIC.CARS.ID
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CARS.MANUFACTURER
     *
     * @return the value of PUBLIC.CARS.MANUFACTURER
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CARS.MANUFACTURER
     *
     * @param manufacturer the value for PUBLIC.CARS.MANUFACTURER
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CARS.MODEL
     *
     * @return the value of PUBLIC.CARS.MODEL
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    public String getModel() {
        return model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CARS.MODEL
     *
     * @param model the value for PUBLIC.CARS.MODEL
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CARS.DRIVER_ID
     *
     * @return the value of PUBLIC.CARS.DRIVER_ID
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    public Integer getDriverId() {
        return driverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CARS.DRIVER_ID
     *
     * @param driverId the value for PUBLIC.CARS.DRIVER_ID
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }


    public Drivers driver;
    public Drivers getDriver() {return this.driver;}
    public void setDriver(Drivers driver) {this.driver = driver;}
}