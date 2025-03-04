package main;

import java.nio.file.Paths;
import java.time.LocalDateTime;

import toolkit.AggregateCsvForBatchFile;
import toolkit.AggregateJsonForBatchFile;
import toolkit.SummaryStatisticsForBatchFile;


/**
 * @author Lin Zhang
 * Programmer / Software Development Engineer
 * Institute for Informatics
 * Washington University School of Medicine in St. Louis
 * <p>
 * Date: August 30, 2021
 */
public class Run {

    public static void main(String[] args) {

        try {
            System.out.println(LocalDateTime.now());
            System.out.println("Start");
            // The "[path_to_the_karyotype_input_file]" is where your karyotypes input is saved, e.g. "C:\\Karyotype_samples.txt"
            // The "[path_to_the_output_JSON_file]" is where you want to save the JSON output, e.g. "C:\\Karyotype_samples.json"
            // The "[path_to_the_output_aggregate_LGF_csv_file]" is where you want to save the aggregate LGF output, e.g. "C:\\Karyotype_samples.csv"
            // The "[path_to_the_output_summary_statistics_csv_file]" is where you want to save the summary statistics output, e.g. "C:\\Karyotype_samples_SummaryStatistics.csv"
//			AggregateJsonForBatchFile.generateJson(Paths.get("[path_to_the_karyotype_input_file]"), Paths.get("[path_to_the_output_JSON_file]"));
//			AggregateCsvForBatchFile.generateAggregateLGF(Paths.get("[path_to_the_karyotype_input_file]"), Paths.get("[path_to_the_output_aggregate_LGF_csv_file]"));
//	        SummaryStatisticsForBatchFile.writeSummaryStatistics(Paths.get("[path_to_the_karyotype_input_file]"), Paths.get("[path_to_the_output_summary_statistics_csv_file]"));
//           	print args
            for (String arg : args) {
                System.out.println(arg);
            }
            AggregateJsonForBatchFile.generateJson(Paths.get(args[0]), Paths.get(args[1]));
            AggregateCsvForBatchFile.generateAggregateLGF(Paths.get(args[0]), Paths.get(args[2]));
            SummaryStatisticsForBatchFile.writeSummaryStatistics(Paths.get(args[0]), Paths.get(args[3]));
            System.out.println(LocalDateTime.now());

            System.out.println("Complete");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(LocalDateTime.now());
            System.out.println("Incomplete");
        }


    }


}
