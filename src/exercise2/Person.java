package exercise2;

public class Person extends ING{

    private Bank bankProvider;


    public Person(Bank bankProvider) {
        this.bankProvider = bankProvider;
    }


    public void setBankProvider(Bank bankProvider) {
        this.bankProvider = bankProvider;
    }

}
