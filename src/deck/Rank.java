package deck;

public enum Rank {Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King;
public int returnCribbageScore(){
    if (this.ordinal()<= 8)
        return this.ordinal() + 1;
    return 10;
}
}
