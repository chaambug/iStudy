package com.mycompany.istudy.principalservices;


import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Varuni on 15.12.2016.
 */
public class DumpService {

    private final static Logger logger = Logger.getLogger(DumpService.class);

    public boolean createDump(){
        try{
            String pattern = "yyyyMMddhhmmss";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String currentDate = simpleDateFormat.format(new Date());

            Properties props = new Properties();
            props.load(getClass().getResourceAsStream("system.properties"));


            final String dbname = props.getProperty("dbname");
            final String host = props.getProperty("host");
            final String user = props.getProperty("user");
            final String dumpName = String.format("%s/%s-dump.sql", props.getProperty("backup.dir"), currentDate);
            final String mysql_dump_file = props.getProperty("xampp.mysql.exe.file");

            String command = String.format("%s -h %s -u %s %s > %s", mysql_dump_file, host, user, dbname, dumpName);
            CommandProcessor.processAndWrite(command, dumpName);
        }catch (Exception e){
            logger.error("Error during creation of dump file", e);
            return false;
        }
        return true;
    }
}
