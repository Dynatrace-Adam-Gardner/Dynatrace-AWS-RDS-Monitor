# Dynatrace-AWS-RDS-Monitor

- Use Case #1 - Across all DBs

- Use Case #2 - Statistics per DB (eg. my-db-instance)

- Use Case #3 - Statistics per DB Engine (eg. mysql)

- Use Case #4 - Statistics per DB Class (eg. db.t2.micro)

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