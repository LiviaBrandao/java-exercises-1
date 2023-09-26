package com.company.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard
{
    private static BufferedReader keyboard = new BufferedReader (
                   new InputStreamReader (
                   System.in));

    public static String getAString ()
    {
        String ret=null;

        try
        {
            ret = keyboard.readLine ();
        }
        catch (IOException error)
        {} // sei que nao vai dar error

        return ret;
    }

    public static byte getAByte() throws Exception
    {
        byte ret=(byte)0;

        try
        {
            ret = Byte.parseByte (keyboard.readLine ());
        }
        catch (IOException error)
        {} // sei que nao vai dar error
        catch (NumberFormatException error)
        {
            throw new Exception ("Byte invalid!");
        }

        return ret;
    }
 
    public static short getAShort() throws Exception
    {
        short ret=(short)0;

        try
        {
            ret = Short.parseShort (keyboard.readLine ());
        }
        catch (IOException error)
        {} // sei que nao vai dar error
        catch (NumberFormatException error)
        {
            throw new Exception ("Short invalid!");
        }

        return ret;
    }

    public static int getAInt() throws Exception
    {
        int ret=0;

        try
        {
            ret = Integer.parseInt (keyboard.readLine ());
        }
        catch (IOException error)
        {} // sei que nao vai dar error
        catch (NumberFormatException error)
        {
            throw new Exception ("Int invalid!");
        }

        return ret;
    }

    public static long getALong() throws Exception
    {
      //long ret=(long)0;
      //long ret=0;
        long ret=0L;

        try
        {
            ret = Long.parseLong (keyboard.readLine ());
        }
        catch (IOException error)
        {} // sei que nao vai dar error
        catch (NumberFormatException error)
        {
            throw new Exception ("Long invalid!");
        }

        return ret;
    }

    public static float getAFloat() throws Exception
    {
      //float ret=0;
      //float ret=(float)0.0;
        float ret=0.0F;

        try
        {
            ret = Float.parseFloat (keyboard.readLine ());
        }
        catch (IOException error)
        {} // sei que nao vai dar error
        catch (NumberFormatException error)
        {
            throw new Exception ("Float invalid!");
        }

        return ret;
    }

    public static double getADouble() throws Exception
    {
      //double ret=0;
      //double ret=(long)0;
      //double ret=0L;
        double ret=0.0;

        try
        {
            ret = Double.parseDouble (keyboard.readLine ());
        }
        catch (IOException error)
        {} // sei que nao vai dar error
        catch (NumberFormatException error)
        {
            throw new Exception ("Double invalid!");
        }

        return ret;
    }

    public static char getAChar() throws Exception
    {
        char ret=' ';

        try
        {
            String str = keyboard.readLine ();

            if (str==null)
                throw new Exception ("Char invalid!");

            if (str.length() != 1)
                throw new Exception ("Char invalid!");

             ret = str.charAt(0);
        }
        catch (IOException error)
        {} // sei que nao vai dar error

        return ret;
    }

    public static boolean getABoolean() throws Exception
    {
        boolean ret=false;

        try
        {
            String str = keyboard.readLine ();

            if (str==null)
                throw new Exception ("Boolean invalid!");

            if (!str.equals("true") && !str.equals("false"))
                throw new Exception ("Boolean invalid!");

            ret = Boolean.parseBoolean (str);
        }
        catch (IOException error)
        {} // sei que nao vai dar error

        return ret;
    }
}