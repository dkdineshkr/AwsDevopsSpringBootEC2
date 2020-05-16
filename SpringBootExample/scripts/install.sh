echo 'Installing SpringBoot project to Maven'
cd '/home/ec2-user/server'
mvn clean install

echo 'Running SpringBoot project'
cd '/home/ec2-user/server/target'
cat /dev/null > /home/ec2-user/MySpringBoot.log
java -jar MySpringBoot.jar >> /home/ec2-user/MySpringBoot.log 2>&1 &