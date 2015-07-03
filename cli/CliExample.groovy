import org.apache.commons.cli.Option 

def cli = new CliBuilder(
    usage  : "CliBuilderExample: -c cityName -s stateName -z zipCodes",
    header : "\nAvailable options (use -h for help):\n",
    footer : "\nInformation provided via above options is used to generate printed string."
)

cli.with {
    h(longOpt: 'help', 'Usage Information', required: false)  
    c(longOpt: 'city', 'City Name', args: 1, required: true)  
    s(longOpt: 'state', 'State Name', args: 1, required: true)  
    z(longOpt: 'zip', 'Zip Codes (separated by comma)', required: true, args: Option.UNLIMITED_VALUES, valueSeparator: ',')  
    o(longOpt: 'options', 'Print Options', required: false)  
}


def options = cli.pase(args)

