
package utils;


import java.io.* ;

public class FileLogger
{
  private static FileLogger logger;

  private FileLogger()
  {
  }

  public static FileLogger getLogger()
  {
    if (logger == null)
    {
      logger = new FileLogger();
    }
    return logger;
  }

  public boolean log(String msg)
  {
    try
    {
      PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true));
      writer.println(msg);
      writer.close();
    }
    catch (FileNotFoundException ex)
    {
      return (false);
    }
    catch (IOException ex)
    {
      return (false);
    }
    return (true);
  }
}