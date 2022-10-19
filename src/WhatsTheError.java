public class WhatsTheError
{
    private int score;

    public WhatsTheError (int score)
    {
        this.score = score;
    }

    public String grade()
    {
        if (score >= 90)
        {
            return "A";
        }
        if (score >= 80)
        {
            return "B";
        }
        if (score >= 70)
        {
            return "C";
        }
        if (score >= 60)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }
}