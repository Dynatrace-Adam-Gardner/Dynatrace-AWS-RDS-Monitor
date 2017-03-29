# Dynatrace-AWS-RDS-Monitor

- Use Case #1 - Across all DBs

- Use Case #2 - Statistics per DB (eg. my-db-instance)

- Use Case #3 - Statistics per DB Engine (eg. mysql)

- Use Case #4 - Statistics per DB Class (eg. db.t2.micro)

#### Available Metrics
Amazon provide guidance on which metrics and aggregation combinations are most useful (see [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/rds-metricscollected.html)) and these are listed in bold below. These are the only metrics that have been tested during development of this plugin. However, others *should* work.

- _BinLogDiskUsage_ - (Unit: **Bytes**) The amount of disk space occupied by binary logs on the master. Applies to MySQL read replicas.
- _CPUUtilization_ - (Unit: **Percent**) The percentage of CPU utilization.
- _CPUCreditUsage_ - (Unit: **Count**) T2 instances only. Only available at 5 minute frequency. If you specify a period greater than 5 minutes, use *Sum* instead of *Average*. The number of CPU credits consumed by the instance.
- _CPUCreditBalance_ - (Unit: **Count**) T2 instances only.Only available at 5 minute frequency. The number of CPU credits available for the instance to burst beyond its base CPU utilization. Credits are stored in the credit balance after they are earned and removed from the credit balance after they expire. Credits expire 24 hours after they are earned.
- _DatabaseConnections_ - (Unit: **Count**) The number of database connections in use.
- _DiskQueueDepth_ - (Unit: **Count**) The number of outstanding IOs (read/write requests) waiting to access the disk.
- _FreeableMemory_ - (Unit: **Bytes**) The amount of available RAM.
- _FreeStorageSpace_ - (Unit: **Bytes**) The amount of available storage space.
- _ReplicaLag_ - (Unit: **Seconds**) Applies to MySQL, MariaDB and PostgreSQL Read Replicas. Amount of time a Read Replica DB instance lags behind the source DB instance.
- _SwapUsage_ - (Unit: **Bytes**) Amount of swap space used on the DB instance.
- _ReadIOPS_ - (Unit: **Count**) Average number of disk I/O operations per second.
- _WriteIOPS_ - (Unit: **Count**) Average number of disk I/O operations per second.
- _ReadLatency_ - (Unit: **Seconds**) Average amount of time taken per disk I/O operation.
- _WriteLatency_ - (Unit: **Seconds**) Average amount of time taken per disk I/O operation.
- _ReadThroughput_ - (Unit: **Bytes**) Average number of bytes read from disk per second.
- _WriteThroughput_ - (Unit: **Bytes**) Average number of bytes written to disk per second.
- _NetworkReceiveThroughput_ - (Unit: **Bytes**) The incoming (Receive) network traffic on the DB instance, including both customer database traffic and Amazon RDS traffic used for monitoring and replication.
- _NetworkTransmitThroughput_ - (Unit: **Bytes**) The outgoing (Transmit) network traffic on the DB instance, including both customer database traffic and Amazon RDS traffic used for monitoring and replication.

## Prerequisites
To use this plugin, you'll need the following details:

- **Access Key**: User must be in a group which has the *CloudWatchReadOnlyAccess* permission.
- **Secret Access Key**: Corresponding Secret Access key for the above.
- **AWS Region**: eg. *eu-west-2* defaults to *eu-west-2*
- *Optional* DB instance names / DB engines or machine class (see use cases #2 - #4 above). Only required if you want stats split by the above use cases rather than an aggregated view.

## Usage

1. Download the latest release from the Dynatrace Community.
2. Install the plugin via the client (or use the [REST interface](https://community.dynatrace.com/community/pages/viewpage.action?pageId=221381697) to automate).
3. Create a monitor and configure the monitor (the *host* setting is not used so setting this to localhost is acceptable).

### IMPORTANT: Supported Data Granularities

The **data granularity** and the plugin schedule time **MUST** match. In the following screenshots, both are set to 5 minutes.

#### Supported Data Granularities

- "1 Minute"
- "5 Minutes"
- "10 Minutes"
- "15 Minutes"
- "30 Minutes"
- "1 Hour"

![Alt text](http://i68.tinypic.com/120rx2a.png)
