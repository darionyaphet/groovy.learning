import groovy.util.CliBuilder

def cli = new CliBuilder(usage:'ls')
cli.a('display all files')
cli.l('use a long listing format')
cli.t('sort by modification time')
def options = cli.parse(args)
