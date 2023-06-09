package com.demo.multiton;

/*import com.google.common.collect.Iterables;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
*/


interface Database
{
  int getPopulation(String name);
}



class SingletonDatabase
{
//  private Dictionary<String, Integer> capitals = new Hashtable<>();
//  private static int instanceCount = 0;
//  public static int getCount() { return instanceCount; }
//
//  private SingletonDatabase()
//  {
//    instanceCount++;
//    System.out.println("Initializing database");
//
//    try {
//      File f = new File(
//        Testability.class.getProtectionDomain()
//        .getCodeSource().getLocation().getPath()
//      );
//      Path fullPath = Paths.get(f.getPath(), "capitals.txt");
//      List<String> lines = Files.readAllLines(fullPath);
//
////      Iterables.partition(lines, 2)
////        .forEach(kv -> capitals.put(
////          kv.get(0).trim(),
////          Integer.parseInt(kv.get(1))
////        ));
//    }
//    catch (Exception e)
//    {
//      // handle it!
//      System.err.println(e);
//    }
//  }
//
//  private static final SingletonDatabase INSTANCE = new SingletonDatabase();
//
//  public static SingletonDatabase getInstance()
//  {
//    return INSTANCE;
//  }
//
//  public int getPopulation(String name)
//  {
//    return capitals.get(name);
//  }
//}
//
//class SingletonRecordFinder
//{
//  public int getTotalPopulation(List<String> names)
//  {
//    int result = 0;
//    for (String name : names)
//      result += SingletonDatabase.getInstance().getPopulation(name);
//    return result;
//  }
//}
//
//class ConfigurableRecordFinder
//{
//  private Database database;
//
//  public ConfigurableRecordFinder(Database database) {
//    this.database = database;
//  }
//
//  public int getTotalPopulation(List<String> names)
//  {
//    int result = 0;
//    for (String name : names)
//      result += database.getPopulation(name);
//    return result;
//  }
//}
//
//class SingletonTestabilityDemo
//{
//  public static void main(String[] args) {
//    SingletonDatabase db = SingletonDatabase.getInstance();
//
//    String city = "Tokyo";
//    int pop = db.getPopulation(city);
//    System.out.println(
//      String.format("%s has population %d", city, pop)
//    );
//  }
//}
//
//class DummyDatabase implements Database
//{
//  private Dictionary<String, Integer> data = new Hashtable<>();
//
//  public DummyDatabase() {
//    data.put("alpha", 1);
//    data.put("beta", 2);
//    data.put("gamma", 3);
//  }
//
//  @Override
//  public int getPopulation(String name)
//  {
//    return data.get(name);
//  }
//}
}
