Enable DevTools at IntelliJ IDE

> Settings
>> Build, Execution, Deployment
>>> Compiler
>>>> Build Project Automatically

> Settings
>> Advanced Settings
>>> Compiler
>>>> Allow auto-make to start even if developed application is currently running

**Note:** After mark these checkboxes restart the IDE and be Happy :)

### Environment Variables
Export the following environment variable before running the app.
Its configuration is based on 12 factors app principle: 3-Configuration.
We have no issues pushing our source code to remote public repository. 

Environment variables:

- spring.datasource.url=${DB_CONNECTION_URL}
- spring.datasource.username=${DB_USERNAME}
- spring.datasource.password=${DB_PASSWORD}