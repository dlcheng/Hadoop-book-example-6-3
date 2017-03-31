import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MaxTemperatureMapper
  extends Mapper<LongWritable, Text, Text, IntWritable> {

  private DataRecordParser parser = new DataRecordParser();
// let the DataRecordParser do the dirty jobs.
  @Override
  public void map(LongWritable key, Text value, Context context)
    throws IOException, InterruptedException {

      parser.parse(value);
      if(parser.isValidRecord()) {
        context.write(new Text(parser.getKey()), new IntWritable(parser.getValue()));
      }
    }
}

 