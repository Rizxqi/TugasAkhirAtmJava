import java.util.Scanner;

/**
 * AtmMachineGroup5
 */
public class Trialatm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int DepositAmount ; 
        int WithdrawalAmount; 
        int TotalWithdraw ; 
        int TotalDeposit ;
        int Balance = 1000000;
        int TransferAmount;
        int TotalTransfer; 
        int InfoBalance; 
        int choose  ;
        int Pin = 1234 ;

        System.out.println("Masukan PIN : ");
        Pin = sc.nextInt();
            if (Pin == 1234) {
            System.out.println("menu");       
        System.out.println(" Choose : ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. Info Balance");
        System.out.print("\nPilih Menu : ");
        choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Deposit : ");
                    DepositAmount = sc.nextInt();
                    TotalDeposit = DepositAmount + Balance;
                    System.out.println("Total Deposit : " +TotalDeposit);
                    break;
                case 2: 
                    System.out.println("\nWithdraw : ");
                    WithdrawalAmount = sc.nextInt(); 
                    if (WithdrawalAmount < Balance) {
                        TotalWithdraw = Balance - WithdrawalAmount;
                        System.out.println("Total Withdraw : " + WithdrawalAmount);                    
                        System.out.println("Saldo anda seakrang : "+ TotalWithdraw);                        
                    } else {                    
                        System.out.println("Saldo anda tidak mencukupi ");                        
                    }                                   
                    break; 
                case 3: 
                    System.out.println("Transfer : " );
                    TransferAmount = sc.nextInt(); 
                    if (TransferAmount < Balance) {
                        TotalTransfer = Balance - TransferAmount; 
                        System.out.println("Total Transfer : " + TotalTransfer);
                    } else {
                        System.out.println("Saldo anda tidak mencukupi "); 
                    }                                    
                    break;
                case 4:
                    System.out.println("infoBalance " + Balance);
                    break;
                default:
                    break;
            }
                } else {
            System.out.println(" Mohon maaf pin yang anda masukkan salah ");
             
            }
    }
}