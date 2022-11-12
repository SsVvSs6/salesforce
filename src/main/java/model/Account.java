package model;

public class Account {

    private String accountName;
    private String webSite;
    private String industry;

    public Account(String accountName, String webSite, String industry) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.industry = industry;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public String getIndustry() {
        return industry;
    }
}
