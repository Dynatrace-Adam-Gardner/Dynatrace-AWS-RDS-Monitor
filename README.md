# Dynatrace-AWS-RDS-Monitor

- Use Case #1 - Across all DBs

- Use Case #2 - Statistics per DB (eg. my-db-instance)

- Use Case #3 - Statistics per DB Engine (eg. mysql)

- Use Case #4 - Statistics per DB Class (eg. db.t2.micro)

The Data Granularity setting defines how far back in time the plugin looks for data. A data granularity of 10mins will retrieve Cloudwatch statistics for *time now - 10mins*

Make sure the data granularity and the monitor execution schedule both match (ie. they're both set to the same value). Failure to do so will result in strange data.