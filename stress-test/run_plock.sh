#!/bin/bash
# ${1} : VSR
# ${2} : TICKETS
# ${3} : ITERATION

echo "Run PLOCK with VSR:${1} TICKETS:${2} ITERATION:${3}"

VSR=${1}
TICKETS=${2}
ITERATION=${3}
LOCKTYPE="p-lock"

export VSR
export TICKETS
export ITERATION
export LOCKTYPE

docker compose -f docker-compose.stress-k6-only.yml up

sleep 3
sh ./cleanup.sh
