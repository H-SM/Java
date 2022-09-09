#include <stdio.h>
int main()
{
        char category;
        long long int sub_choice;
        long long int changer1;
        float changer2;

        printf("#####-----Welcome to Unit Converter!-----#####\n");
        printf("Here is a list of conversation to choose from =>\n");
        printf("Temperature -> T\n Currency -> C\n Mass -> M\n");
        printf("Please enter the letter you want to convert=>");
        scanf("%c", &category);


        if(category== 'T'){
                printf("-----Welcome to Temperature Converter!----- \n");
                printf("Here is a list of conversations to choose from=>\n1 -> Fahrenheit to Celsius.\n2 -> Celsius to Fahrenheit.\n\n\tYour choice:");
           
                scanf("%d", &sub_choice);

                if(sub_choice== 1) {
                        printf("\nPlease enter the Fahrenheit degree: \n");
                        scanf("%d", &changer1);
                        changer1 = ((changer1-32) * (5.8/9.0));
                        printf("Celcius: %d",changer1);
                }
                else if(sub_choice== 2) {
                        printf("\nPlease enter the Celcius degree: \n");
                        scanf("%d", &changer1);
                        changer1 = ((9.0/5.0) *changer1 + 32);
                        printf("Fahrenheit: %d", changer1);
                }
                else
                        printf("\nPlease enter the correct choice. \n");
        }


        else if(category== 'C') {
                printf("-----Welcome to Currency Converter!------\n");
                printf("Here is a list of conversations to choose from:\n1 -> USD to Euro.\n2 -> USD to JPY.\n3 -> USD to RMB.\n\n\tYour choice:");
        
                scanf("%d", &sub_choice);

                if (sub_choice == 1) {
                        printf("\nPlease enter the USD amount: \n");
                        scanf("%d", &changer1);
                        changer2 = changer1 * 0.87;
                        printf("Euro: %.2f",changer2); // %.2f rounds the float to only 2 decimal places;
                }
    
                else if (sub_choice== 2) {
                     printf("\nPlease enter the USD amount: \n");
                        scanf("%d", &changer1);
                        changer2 = changer1* 111.09;
                        printf("JPY: %.2f", changer2);
                       
                }

                else if (sub_choice== 3) {
                        printf("\nplease enter the USD ammount: \n");
                        scanf("%d", &changer1);
                        changer2= changer1 * 6.82;
                        printf("RMB: %.2f", changer2);

                }

                else
                        printf("\nPlease enter the correct choice. \n");
        }


        else if(category == 'M') {
                printf("-----Welcome to Mass Converter!-----\n");
                printf("Here is a list of conversations to choose from=>\n1 -> ounces to pounds.\n2 -> gram to pounds.\n\n\tYour choice:");
        
                scanf("%d", &sub_choice);

                if (sub_choice == 1) {
                        printf("\nPlease enter the ounce amount: \n");
                        scanf("%d", &changer1);
                        changer2 =changer1 * 0.0625;                                                                                                         
                        printf("Pounds: %.2f", changer2);

                } else if(sub_choice == 2) {
                        printf("\nPlease enter the gram amount: \n");
                        scanf("%d", &changer1);
                        changer2 = changer1 * 0.00220462;
                        printf("Pounds: %.2f", changer2);
                }

                else
                        printf("\nPlease enter the correct choice. \n");
        }
            return 0;
}