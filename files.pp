class docker::files {

file {'/home/edureka/notificationapp-1.war':
 ensure => present,
 mode => '0777',
 source => "puppet:///modules/docker/notificationapp-1.war"
}

file {'/home/edureka/Dockerfile':
 ensure => present,
 mode => '0777',
 source => "puppet:///modules/docker/Dockerfile"
}

exec {'build_dockerfile':
 command => "/usr/bin/docker build -t edureka/new '/home/edureka/'"
}

exec {'run_docker':
 command => "/usr/bin/docker run -it -d -p 8091:8080 edureka/new"
}
}
