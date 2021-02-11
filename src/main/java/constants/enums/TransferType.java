package constants.enums;

public enum TransferType {

    BANK_CARD("Bank Card"),
    ACCOUNT("Account"),
    CASH_COLLECTION("Cash Collection");

    private final String transferType;

    TransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getTransferType() {
        return transferType;
    }
}
