
public class Driver4
{
  public static void main(String []args)
  {
    HotDogStand s1 = new HotDogStand(0,0);
    HotDogStand s2 = new HotDogStand(2,0);
    HotDogStand s3 = new HotDogStand(3,0);

    s1.setHotDogStand(1);

    s1.justSold();
    s2.justSold();
    s1.justSold();

    s1.soldByStand();
    s2.soldByStand();
    s3.soldByStand();

    HotDogStand.counter();

    s3.justSold();
    s1.justSold();

    s1.soldByStand();
    s2.soldByStand();
    s3.soldByStand();

    HotDogStand.counter();
  }
}
