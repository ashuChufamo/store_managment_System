package store_managment_system;

import java.util.Date;

public class Items{
    private String name;
    private String Id;
    private long price;
    private String type;
    private String itemBrand;
    private Date RegDate;
    private String status;

    public Items(String name, String Id, long price, String type, String status,String itemBrand) {
        this.name = name;
        this.Id = Id;
        this.price = price;
        this.type = type;
        this.status = status;
        this.itemBrand=itemBrand;
    }

    public Items(String Id) {
        this.Id = Id;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getRegDate() {
        return RegDate;
    }

    public void setRegDate(Date RegDate) {
        this.RegDate = RegDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
