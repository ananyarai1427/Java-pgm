class Sec
{
    int solve()
    {
        int x = 2, y = 50;
        do
        {
            ++x;
            y-=x++;
        }while(x<=10);
        return y;
    }
    public static void main(String args[])
    {
        Sec ob = new Sec();
        ob.solve();
    }
}