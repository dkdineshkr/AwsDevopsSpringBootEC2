echo 'killing existing MySpringBoot.jar process if any'
ps -ef | grep -i MySpringBoot.jar | grep -v grep  | awk '{print $2}' | xargs kill
sleep 20

echo 'check if maven is installed'
mvn --version
if [ "$?" -ne 0 ]; then
    echo 'Installing Maven...'
	sudo yum install maven -y
	mvn --version
fi