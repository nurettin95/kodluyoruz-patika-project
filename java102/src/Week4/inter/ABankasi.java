package Week4.inter;

public class ABankasi implements IBank{
    private String bankAdi;
    private String terminalId;
    private String password;

    public ABankasi(String bankAdi, String terminalId, String password) {
        this.bankAdi = bankAdi;
        this.terminalId = terminalId;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip " + ipAddress);
        System.out.println("Makine ip : " + this.hostIpAddress);
        System.out.println(this.bankAdi + " Bağlanıldı !");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String date, String cvc){
        //Banka ödeme işlemleri
        System.out.println("Bankadan cevap bekleniyor..");
        System.out.println("İşlem başarılı oldu !");
        return true;
    }

    public String getBankAdi() {
        return bankAdi;
    }

    public void setBankAdi(String bankAdi) {
        this.bankAdi = bankAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
