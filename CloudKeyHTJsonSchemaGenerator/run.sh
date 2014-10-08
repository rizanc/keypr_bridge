#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
SCRIPT="$DIR/build/install/CloudKeyHTJsonSchemaGenerator/bin/CloudKeyHTJsonSchemaGenerator"

if [ -f "$SCRIPT" ]
then
	sh build/install/CloudKeyHTJsonSchemaGenerator/bin/CloudKeyHTJsonSchemaGenerator $@
else
	echo "'gradle installApp' must be called for CloudKeyHTJsonSchemaGenerator before this may be used"
fi
