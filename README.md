# FitFile4j

Parse _.fit_ files from your activity tracker with _fitfile4j-parser_ or convert them to JSON with _fitfile4j-cli_.

> [!IMPORTANT]
> But beware of the early state of this project.
> It's not that things "might" change, but more that things definitely will change in the coming days.

Started as a spin-off from my previous experience on reading _.fit_ files wth
Rust (https://github.com/meistermeier/rusty-but-fit),
now available as a Java library.

At the moment the cli part creates exactly the output of rusty-but-fit's `fit-to-json` tool.

## FitFile4j-CLI usage and examples

The whole project can be built with `./mvnw package`.
It will not only build the needed libraries but also the `fitfile4j-cli` tool.

Use `java -jar fitfile4j-cli/target/fitfile4j.jar` to invoke the commandline tool.

### Output JSON from a .FIT file

`java -jar fitfile4j-cli/target/fitfile4j.jar json <fitfile>` will render a raw JSON output
```json
[
  {
    "message_number": 0,
    "entries": {
      "1": 1,
      "2": 3077,
      "0": 4
    }
  },
  {
    "message_number": 49,
    "entries": {
      "2": "",
      "0": 1370
    }
  },
...
]
```

Using `java -jar fitfile4j-cli/target/fitfile4j.jar json -n <fitfile>` will include the names given by the Garmin SDK.
```json
[
  {
    "message_number": 0,
    "message_name": "file_id",
    "entries": {
      "serial_number": 3301605507,
      "time_created": 1111660699,
      "manufacturer": "garmin",
      "product": 3077,
      "type": "activity"
    }
  },
  {
    "message_number": 49,
    "message_name": "file_creator",
    "entries": {
      "2": "",
      "software_version": 1370
    }
  },
...
]
```
If the name cannot be found, the raw field number will be returned as the field name.

### Track as image
> [!IMPORTANT]
> Currently broken

### Insert into DuckDB
_not documented yet_
