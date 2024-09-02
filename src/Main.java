public class Main {
    /*
    Calculateur d’Année Bissextile

Écrivez une méthode appelée isLeapYear avec un paramètre de type int nommé year.

Le paramètre doit être supérieur ou égal à 1 et inférieur ou égal à 9999. Si le paramètre n’est pas dans cette plage, la méthode doit retourner false.

Sinon, si l’année est dans la plage valide, calculez si l’année est bissextile et retournez true si c’est une année bissextile, sinon retournez false.

Pour déterminer si une année est bissextile, suivez ces étapes :

	1.	Si l’année est divisible par 4, passez à l’étape 2. Sinon, passez à l’étape 5.
	2.	Si l’année est divisible par 100, passez à l’étape 3. Sinon, passez à l’étape 4.
	3.	Si l’année est divisible par 400, passez à l’étape 4. Sinon, passez à l’étape 5.
	4.	L’année est une année bissextile (elle a 366 jours). La méthode isLeapYear doit retourner true.
	5.	L’année n’est pas une année bissextile (elle a 365 jours). La méthode isLeapYear doit retourner false.

Une autre façon de formuler cela est la suivante :

	•	Une année bissextile est une année divisible par 4 mais pas par 100.
	•	Si elle est divisible par 100, elle doit être aussi divisible par 400.

Les années suivantes ne sont pas des années bissextiles :

	•	1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
	•	Cela est dû au fait qu’elles sont divisibles par 100 mais pas par 400.

Les années suivantes sont des années bissextiles :

	•	1600, 2000, 2400
	•	Cela est dû au fait qu’elles sont divisibles à la fois par 100 et par 400.

Exemples d’entrée/sortie :

	•	isLeapYear(-1600); → devrait retourner false car le paramètre n’est pas dans la plage (1-9999).
	•	isLeapYear(1600); → devrait retourner true car 1600 est une année bissextile.
	•	isLeapYear(2017); → devrait retourner false car 2017 n’est pas une année bissextile.
	•	isLeapYear(2000); → devrait retourner true car 2000 est une année bissextile.

NOTE : La méthode isLeapYear doit être définie comme public static, comme nous l’avons fait jusqu’à présent dans le cours.
NOTE : N’ajoutez pas de méthode main au code de la solution.
     */
    public static boolean isLeapYear(int year) {
        //si divisible par 400 et bissextile
        if(year%400==0){
            return true;
        }
        //Si divisible par 100 n'est pas bissextile
        if(year%100==0){
            return false;
        }
        //Si divisible par quatre alors bissextile sinon affiche faux
        else return year%4==0;
    }
}
