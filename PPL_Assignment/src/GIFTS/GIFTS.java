
package GIFTS;

public class GIFTS {
    public String name ;
    public int price ;
    public int value ;
    public int type ;
    public int luxuryRating = -1 ;
    public int difficultyToObtain = -1 ;
    public int utilityValue = -1;
    public int utilityClass = -1;

    public GIFTS(String n , int p, int v, int t) {
        this.name = n;
        this.price = p;
        this.value = v;
        this.type = t;
    }
}
